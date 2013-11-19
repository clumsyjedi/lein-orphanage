(ns leiningen.orphanage
  (:require [orphanage.core :refer :all]))

(defn orphanage
  [project & args]
  (doseq [o (keys (find-orphans "."))]
    (println o)))
