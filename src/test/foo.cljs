(ns test.foo)

(defprotocol IInterpreter
  (interpret [this]))

(extend-protocol IInterpreter
  List
  (interpret [this]
    this)
  default
  (interpret [this]
    this)
  nil
  (interpret [this]
    nil))

(defn foo []
  (interpret (js/React.createElement "un" nil)))
