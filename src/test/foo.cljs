(ns test.foo)

(defprotocol Proto
  (f [this]))

(defn foo []
  (f js/Math.E))
