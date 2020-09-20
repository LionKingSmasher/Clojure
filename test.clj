(def message "TEST")
(def g 9.8)
(defn rad [a](* a (/ 180 Math/PI)))
(defn r2a [a](* a (/ Math/PI 180)))
(defn add
	([a b](+ a b))
)
(defn CMP_STR
	([a](string? a))
	)

(defn CannonX
	([V0 Angle t]
		(def x (* t (* V0 (Math/cos (r2a Angle)))))
		(format "Result X: %f" x)
		)
	)
(defn CannonY
	([V0 Angle t]
		(def y (- (* t (* V0 (Math/sin (r2a Angle)))) (* g (* t t))))
		(format "Result Y: %f" y)
		)
	)