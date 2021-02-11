(ns reify-interview.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.util.response :as resp]))

(defroutes app-routes
  (wrap-json-response
   (GET "/todos" {{:keys [completed]} :params}
        ;; TODO Goal 2: Fetch todos from the database
        ;; TODO Goal 3: For /todos?completed=true or /todos?completed=false,
        ;; only fetch completed todos or not completed todos
        (resp/response
         [{:id 1 :title "Do homework" :completed false}
          {:id 2 :title "Ace coding interview" :completed false}])))
  (route/resources "resources/public")
  (route/not-found "Not Found"))

(defn wrap-dir-index [handler]
  (fn [req]
    (handler (update req :uri #(if (= "/" %) "/index.html" %)))))

(def app
  (-> app-routes
      (wrap-defaults site-defaults)
      (wrap-dir-index)))
