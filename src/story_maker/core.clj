(ns story-maker.core)

(defn noun [] (rand-nth ["house" "cat" "kettle" "potato"]))
(defn adjective [] (rand-nth ["fast" "quiet" "lemony"]))
(defn place [] (rand-nth ["barn" "castle" "potato shop" "taxidermist" "dojo"]))

(defn hello [name] (str "Hello " name))

(defn story ([]
	(str "The " (adjective) " " (noun)))
	([name]
	(str name " was in the " (adjective) " " (place))))
