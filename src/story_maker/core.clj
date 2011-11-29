(ns story-maker.core)

(defn choose [thing]
	(let [choices {
		:person ["priest" "soldier" "sailor" "farmer" "schoolgirl"]
		:villain ["englishman" "potato" "horticulturalist"]
		:villain-adj ["mustachioed" "insane" "hooded"]}]
		(rand-nth (thing choices))))

(defn noun [] (rand-nth ["house" "cat" "kettle" "potato" "a small woodland creature"]))
(defn adjective [] (rand-nth ["fast" "quiet" "lemony"]))
(defn place [] (rand-nth ["barn" "castle" "potato shop" "taxidermist" "dojo"]))
(defn reason [] (rand-nth ["due to global warming" "to get to the other side" "to win the heart of their loved one" "dubstep"]))

(defn sad-act [] (rand-nth ["perish" "leave their home" "fall into the shredder" "eat a piano" "program in Java"]))

(def templates
	{
		:comedy (fn [] (str "why did the " (noun) " cross the " (place) "? " (reason)  ))
		:tragedy (fn [] (str "Why did " (choose :person) " " (sad-act) "? " (reason)))
		:quest (fn [] (str "Why did the " (choose :person) " go off to fight the " (choose :villain-adj) " " (choose :villain) "? " (reason)))
		:crime (fn [] (str "who did it? IT WAS " (choose :villain) "!"))
	})

	(defn beginning [] (rand-nth [(str "Once upon a time in " (place) ". ") 
	                               (str "Long, long ago in " (place) ". ")]))
(defn middle []
	(rand-nth [(str "there lived a " (choose :person) " who " (sad-act))
	(str (choose :person) " was a very lonely " (noun))
	(str "a very old " (choose :person) " said " (noun))]))
(defn end [] (rand-nth [
	(str " and they all lived happily ever after.")
	(str " and they pooled their paychecks to purchase a " (adjective) " " (noun))
	(str " and a wizard cursed them and turned into a " (noun) " except " (choose :person))]))

	(defn long-story []
		(str (beginning) (middle) (end)))

(defn hello [name] (str "Hello " name))

(defn short-story ([]
	(((rand-nth (keys templates)) templates)))
	([name]
	(str name " was in the " (adjective) " " (place))))
