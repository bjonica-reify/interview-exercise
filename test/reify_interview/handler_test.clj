(ns reify-interview.handler-test
  (:require [cheshire.core :as json]
            [clojure.test :refer [deftest testing is]]
            [ring.mock.request :as mock]
            [reify-interview.handler :as handler]))

(def all-todos [{:id 1 :title "Do homework" :completed false}
                {:id 2 :title "Ace coding interview" :completed false}
                {:id 3 :title "Prepare for coding interview" :completed true}])

(deftest test-app
  (testing "all todos"
    (let [response (handler/app (mock/request :get "/todos"))]
      (is (= 200 (:status response)))
      (is (= all-todos (json/parse-string (:body response) true)))))

  (testing "completed todos"
    (let [response (handler/app (mock/request :get "/todos?completed=true"))]
      (is (= 200 (:status response)))
      (is (= (filterv :completed all-todos)
             (json/parse-string (:body response) true)))))

  (testing "incomplete todos"
    (let [response (handler/app (mock/request :get "/todos?completed=false"))]
      (is (= 200 (:status response)))
      (is (= (filterv (complement :completed) all-todos)
             (json/parse-string (:body response) true))))))
