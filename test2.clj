(defn abs
	([a](
		if (< a 0)
				(do(* a -1))
				(do(* a 1))))
)