(ns fast-and-or-furious.core-test
  (:require [clojure.test :refer :all]
            [fast-and-or-furious.core :refer :all]))

(deftest fast-test
  (is (fast "The Fast and the Furious"))
  (is (fast "2 Fast 2 Furious"))
  (is (fast "The Fast and the Furious: Tokyo Drift"))
  (is (fast "Fast & Furious"))
  (is (fast "Fast Five"))
  (is (fast "Fast & Furious 6"))
  (is (fast "Furious 7"))
  (is (fast "The Fate of the Furious"))

  (is (not (fast "The Sorrow and the Pity")))
  (is (not (fast "La La Land")))
  (is (not (fast "Cape Fear (1962)")))
  (is (not (fast "Cape Fear (1991)")))
  (is (not (fast "Fast & Furious 100: Electric Boogaloo")))
  (is (not (fast "2 Fast & Furious")))
  (is (not (fast "The Fast 2 Furious")))
  (is (not (fast "The Fast Five")))
  (is (not (fast "Fast & Furious: Tokyo Drift")))
  (is (not (fast "2 Fast 2 Furious 6")))
  (is (not (fast "Fast 2 Furious")))
  (is (not (fast "Fast and the Furious")))
  (is (not (fast "The Fast and the Furious 6")))
  (is (not (fast "Fast & Furious 7")))
  (is (not (fast "The Furious"))))
