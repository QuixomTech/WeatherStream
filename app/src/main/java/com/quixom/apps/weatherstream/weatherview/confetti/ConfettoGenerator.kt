package com.quixom.apps.weatherstream.weatherview.confetti

import com.quixom.apps.weatherstream.weatherview.confetto.Confetto
import java.util.*

/**
 * Created by akif on 11/2/17.
 */
interface ConfettoGenerator {
    /**
     * Generate a random confetto to animate.
     *
     * @param random a [Random] that can be used to generate random confetto.
     * @return the randomly generated confetto.
     */
    abstract fun generateConfetto(random: Random): Confetto
}