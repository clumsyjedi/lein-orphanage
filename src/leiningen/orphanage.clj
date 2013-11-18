(ns leiningen.orphanage
  (:require [orphanage.core :refer :all]
            [clojure.pprint]))

(defn orphanage
  [project & args]
  (println (with-out-str (clojure.pprint/pprint (keys (find-orphans "."))))))
