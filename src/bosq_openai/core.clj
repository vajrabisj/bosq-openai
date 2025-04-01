(ns bosq-openai.core
  (:require [bosquet.llm.openai :as openai]))

(defn direct-call []
  (openai/complete {:prompt "hello there" :model "gpt-4o" :max-tokens 100}))

(defn -main []
  (println "Direct call result:")
  (try
  (direct-call)
  (catch Exception e
    (println "Error:" (.getMessage e))))
  )
