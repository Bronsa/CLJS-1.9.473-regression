````
user> (require '[test.core :refer [compile!]])
nil
user> (compile!)
WARNING: Use of undeclared Var test.foo/js at line 7 src/test/foo.cljs
nil
user>
```
