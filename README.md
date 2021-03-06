Darwin (Genetic Programming)
============================

## Disclaimer

This project is no longer maintained or supported. If you find this useful and would like to contribute or submit a pull request, I will just make you a contributor.

I wrote this back in 2010, when I was a Sophomore in Undergrad. I have not used it or updated it since then. I was an okay programmer back then, but I've learned a lot since then so no guarantees on quality here. I'm dumping this here because I am taking down my old blog and a lot of people would download this from there.

This was before I knew about such things as _patterns_, _testing_, and _libraries_, so there's bad practice all over the place. I don't remember how to use it, what state it was left in, whether it even still works or exactly what each component was supposed to do. That being said, there's probably still some useful code so if you want to root around, feel free.

I remember it being pretty slow, somewhat buggy, and horribly memory-inefficient -- though surprisingly educational.

Released under the WTFPL.

## What was it supposed to be?

This was the third incarnation of my Darwin Genetic Programming Library. I did independent research in GP when I was a Sophomore, and this was my attempt at compiling that research into a library.

There's also a companion website that provides an intro to GP: [The Genetic Programming Source](http://www.geneticprogramming.us) 

If I had to guess, here's probable a breakdown of each package:

* darwin - bulk of the generalize GP code, operations, controls, etc
  * common - common node implementations for stuff like math and logic
  * control - orchestration of the high-level GP operations
  * fitness - fitness evaluation abstractions and rankers
  * geneticOperation - implementations for the various operations which can be performed
  * initialization - mechanisms for generating the initial random seed trees
  * migration - mechanisms for moving individuals from one universe to another
  * nodeFilter - not sure, but maybe something to reject nodes that would be computationally intense?
  * output - GUI stuff but I don't know why it's there
  * population - the abstractions for the individuals and groups of individuals
  * problemObject - I think this is the abstractions for how you defined a particular problem
  * selection - the means to select individuals from the population for reproduction/mutation
  * work - a poorly implemented thread pool and job scheduler LOL
* tui - IIRC, at one point I had both a GUI and a text-based interface, but all that survived was the TUI. Driver contains the main method and sets up a TUI for the glass problem set.
* symbolicRegression - the go-to problem to solve, try to find a mathematical function that fits some data
* glass - a toy problem, trying to match a target image using transparent polygons
* darwInvest - the holy grail of GP, an attempt at trading stocks, or was it forex?
* imageCompression - good question, probably a really bad idea
