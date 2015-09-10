# example_roulette
Program to refactor that plays a game of roulette
It's easier to create a new option for betting.  You just need to add a new subclass
to the abstract Bet class.  You only need to edit the place bet function in order
to decide what the game actually entails of.  This removed the if tree in the Game class which would have been more frustrating down the line to add more options.  We did this by noticing that the user had three options to choose from, and the game class already has an array of each possible option, so we could bypass the conditional by just accessing the index in the myPossibleBets array.  It is definitely more complex since you have to add a class and make sure it has a proper super constructor and implemented functions, which is very easy for most java users but not for beginners as much.  It's not quite as readable, since it's calling other classes behind the scenes and not all in one class as it did before.  The code is now more spread out across the project.  Personally my partner and I currently prefer the first one; it just felt more readable and natural.  

Done by sam98 and nrg12