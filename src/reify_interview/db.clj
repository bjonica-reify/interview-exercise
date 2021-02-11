(ns reify-interview.db
  (:require [next.jdbc :as jdbc]))

(def db-spec
  {:dbtype "sqlite"
   :dbname "todos.db"})

(comment
  (jdbc/execute! db-spec ["SELECT * FROM todos"])
  )
