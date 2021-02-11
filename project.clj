(defproject reify-interview "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]

                 ;; Web
                 [compojure "1.6.2"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-json "0.5.0"]

                 ;; Database
                 [org.xerial/sqlite-jdbc "3.34.0"]
                 [seancorfield/next.jdbc "1.1.613"]
                 ]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler reify-interview.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]
                        [cheshire/cheshire "5.10.0"]]}})
