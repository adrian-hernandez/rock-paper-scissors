import java.util.Scanner
class RpsMain {
    public static void main(String[] args) {

        Random r = new Random()
        Scanner input = new Scanner(System.in)
        boolean isValidPlay = true
        def userPlay
        def computerPlay
        boolean wantsToPlayAgain
        def decision = 'y'

        while({

            //prompt user to choose something
            println "Choose rock, paper, or scissors (r = rock p = paper s = scissors)"

            while({
                    if(!isValidPlay){
                        println "You need to press r, p, or s. Please try again"
                        println "r = rock p = paper s = scissors"
                    }
                    userPlay = input.next()

                    isValidPlay = ['r','p','s'].contains(userPlay) ? true : false

                    !isValidPlay
            }()) continue



            //pick computer choice at random
            int n = r.nextInt(30) + 1
            if (n > 20) {
                computerPlay = 's'
            } else if (n > 10) {
                computerPlay = 'p'
            } else {
                computerPlay = 'r'
            }

            //ties
            if (userPlay == computerPlay) {
                println "you chose $userPlay and the computer chose $computerPlay"
                println "TIE!"
            }
            //loses
            if (userPlay == 'r' && computerPlay == 'p' ||
                    userPlay == 'p' && computerPlay == 's' ||
                    userPlay == 's' && computerPlay == 'r') {

                println "you chose $userPlay and the computer chose $computerPlay"
                println "YOU LOSE!"
            }

            // wins
            if (userPlay == 'r' && computerPlay == 's' ||
                    userPlay == 'p' && computerPlay == 'r' ||
                    'p' == computerPlay && userPlay == 's') {

                println "you chose $userPlay and the computer chose $computerPlay"
                println "YOU WIN!"
            }

            println "Would you like to play again? (y/n)"
            while({

                if( decision != 'y' && decision != 'n'){
                    println "Oops did you strike the wrong key?\n " +
                            "Please choose (y = yes n = no)"
                }

                decision = input.next()


                decision != 'y' && decision != 'n'
            }()) continue

            wantsToPlayAgain = decision == 'y' ? true : false

            wantsToPlayAgain

        }()) continue
        println "Thanks for playing!"
    }
}
