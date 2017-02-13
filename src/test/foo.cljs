(ns test.foo
  (:require [sablono.core :as sab :include-macros true]))

(defn foo []
  (sab/html [:div (sab/html [:div])]))
