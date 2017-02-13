(ns test.core
  (:require [cljs.build.api :as cljs]))

(defn compile! []
  (cljs/build (cljs/inputs "src")
              {:optimizations :advanced
               :output-to "target/app.js"}))
