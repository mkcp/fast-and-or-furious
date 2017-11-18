(ns fast-and-or-furious.core
  "Clojure port of https://github.com/alunny/r_fast_r_furious/blob/master/fast.js")

(defn fast [s]
  (let [matcher #"^((T(he)(?!.*\d)(?=.*the)|2(?=.* 2)) )?(((Fate(?=.*of)|Fast(?!.*7)) )?(Five|((((of|and) t\3)|\2(?=.*s$)|&(?!.*:)) )?Furious(( (6|7))|: Tokyo Drift)?))$"]
    (some? (re-find matcher s))))
