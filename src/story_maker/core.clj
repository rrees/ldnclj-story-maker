(ns story-maker.core)

(defn choose [thing]
	(let [choices {:person ["priest" "soldier" "sailor"]}]
		(rand-nth (thing choices))))

(defn noun [] (rand-nth ["house" "cat" "kettle" "potato"]))
(defn adjective [] (rand-nth ["fast" "quiet" "lemony"]))
(defn place [] (rand-nth ["barn" "castle" "potato shop" "taxidermist" "dojo"]))
(defn reason [] (rand-nth ["due to global warming" "to get to the other side" "to win the heart of their loved one" "dubstep"]))

(defn sad-act [] (rand-nth ["perish" "leave their home" "fall into the shredder" "eat a piano" "program in Java"]))

(def templates
	{
		:comedy (fn [] (str "why did the " (noun) " cross the " (place) "? " (reason)  ))
		:tragedy (fn [] (str "Why did " (choose :person) " " (sad-act) "? " (reason)))
	})

(defn hello [name] (str "Hello " name))

(defn story ([]
	(((rand-nth (keys templates)) templates)))
	([name]
	(str name " was in the " (adjective) " " (place))))
