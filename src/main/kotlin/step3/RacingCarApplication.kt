package step3

import step3.view.getCarAmounts
import step3.view.getTryCount
import step3.view.printRacingResults

fun main() {
    val racingField = RacingField(CarFactory.create(getCarAmounts()))
    val racingResults = racingField.startRace(getTryCount())
    printRacingResults(racingResults)
}
