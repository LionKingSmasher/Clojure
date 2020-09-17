(def message "TEST")
(def g 9.8)
(defn add
	([a b](+ a b))
)
(defn CMP_STR
	([a](string? a))
	)

(defn CannonX
	([V0 Angle t]
		(def x (* t (* V0 (Math/cos (* Angle (/ 180 Math/PI))))))
		(format "Result X: %f" x)
		)
	)
(defn CannonY
	([V0 Angle t]
		(def y (- (* t (* V0 (Math/sin (* Angle (/ 180 Math/PI))))) (* g (* t t))))
		(format "Result Y: %f" y)
		)
	)