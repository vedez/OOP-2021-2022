# DT228/DT282 Object Oriented Programming 2021-2022

# Teams Links for online classes:

- [Join the class on Teams](https://teams.microsoft.com/l/meetup-join/19%3ameeting_MTE2YWIwOTAtNmVmOS00MmIyLWIzYjYtZDBmN2QzYzI2Y2Ix%40thread.v2/0?context=%7b%22Tid%22%3a%22766317cb-e948-4e5f-8cec-dabc8e2fd5da%22%2c%22Oid%22%3a%2261aab78b-a857-4647-9668-83d4cca5de03%22%7d)

Resources
---------
- [Install the software you will need for this module](install.md)
* [The Java Tutorial from Oracle](http://docs.oracle.com/javase/tutorial/)
* [Games Fleadh](http://www.gamesfleadh.ie/)
* [The Nature of Code](http://natureofcode.com/)
* [The git manual - read the first three chapters](http://git-scm.com/documentation)
* [A video tutorial all about git/github](https://www.youtube.com/watch?v=p_PGUltnB6w)
* [The Processing language reference](http://processing.org/reference/)

## Contact the lecturer
* Email: bryan.duggan@tudublin.ie
* Web: http://bryanduggan.org

# Assessments

- [Assignments](assignments.md)

- Week 5 - Teams Submission
- Week 11 Lab Test 20% 
- Week 13 Assignment Submission - 30%
- End of Year exam - 50%

# Last years course
- https://github.com/skooter500/OOP-2020-2021

# Previous Years Lab Tests
- https://github.com/skooter500/OOP-LabTest-2020-Starter
- https://github.com/skooter500/OOP-LabTest-2020/
- https://github.com/skooter500/OOP-Test-2019-Starter
- https://github.com/skooter500/OOP-Test-2019-Solution
- https://github.com/skooter500/OOP-2018-Lab-Test-2
- https://github.com/skooter500/OOP_Labtest1_2017_Starter
- https://github.com/skooter500/OOP-LabTest1-2016

<<<<<<< HEAD
## Week 5 - Arrays
### Lecture
- [Recording of the class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/Edw1fm7vefhMhbZWVnyJQT4BBfXQPzTg2soHMppqoV51BQ?e=PpPRit)

### Lab
### Learning Outcomes
- Practice iterating over arrays
- Practice computational thinking

Check out this video of the assignment I wrote in GWBasic for the statistics module in first year WMT in Kevin St in 1990 (click the image for video):

[![YouTube](http://img.youtube.com/vi/p3Vui6q_wPw/0.jpg)](https://www.youtube.com/watch?v=p3Vui6q_wPw)

And here is the [source code](https://github.com/skooter500/StatsAssignment) in case you are interested!

Inspired by the video, see if you can write code to generate the following graphs of the rainfall data. Start with the file Arrays.java. You will find these *much easier* if you use the [map function](https://processing.org/reference/map_.html) we learned in Monday's class. 

When you are doing these, make sure your code works even if you change the size of the drawing window or change the values in the array.

- A bar chart:

  ![Sketch](images/p37.png)

  Start by drawing the axis, then draw the ticks and print the text, then draw the bars. You can use ```textAlign(CENTER, CENTER)``` to align the text
  Use the HSB color space to assign different colors to each bar

- A trend line:

	![Sketch](images/p38.png)

  This one is a bit trickier because you have to calculate the start xy and end xy for each line. Your for loop for drawing the trend lines can start at 1 instead of 0 and then you can get the previous value for the start of each line by taking rainfall[i - 1].

- A pie chart 

	![Sketch](images/p39.png)

	You can use the the [arc function](https://processing.org/reference/arc_.html) to draw arcs and sin & cos to calculate the x and y coordinates to print the text. This one is the most challenging. Remember that a pie chart shows the proportion of each data point in the sum of all the data, so you will have to calculate the sum of all the rain fall and figure out how much each month is relative to the sum. It's best to draw the segments first and then draw the labels. Your map function might look something like this:

	```Java
	float angle = map(rainfall[i], 0, sum, 0, TWO_PI);
	```

Don't forget to update your forks of the repository from my master branch and create a new branch for your work today!!



## Week 4 - Loops
### Lecture
- [Recording of the class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/EdUrk_7Hf3hDvXYbJuwQcvkBrEkzVq0Wrn9aJQk5XL2jcw?e=mWbyOj)

### Lab
Keep working on the exercises from last week. If you have them all completed, you can try out [this lab about using git and github](gitlab.md).

=======
>>>>>>> lab4
## Week 3

### Lab

Update your forks and creat a branch on your repos for your work today:

Today you can edit the file Loops.java and try out these procedural drawing exercises. The variable ```mode``` will have the value of 0-9 depending on which number key is pressed. You can use it to switch the pattern being drawn:

### if statement 

- 3 exercises. Click the image for video:

[![YouTube](http://img.youtube.com/vi/18kMOeygmHA/0.jpg)](https://www.youtube.com/watch?v=18kMOeygmHA)

### for loops:

Use a loop, rect and the HSB colour space:

![Sketch](images/p31.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p35.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p36.png)

Use a loop, ellipse, and the HSB colour space:

![Sketch](images/p34.png)

Use a loop, ellipse and the HSB color space to draw this:

![Sketch](images/p33.png)

Use a nested loop to draw this:

![Sketch](images/p32.png)

Try and draw this using ONE for loop. You will need the [text](https://processing.org/reference/text_.html) and [textAlign](https://processing.org/reference/textAlign_.html) functions:

![Sketch](images/p27.png)

Use a nested loop to draw this:

![Sketch](images/p23.png)

Use sin and cos to draw this:

![Sketch](images/p30.png)

Use line, sin and cos to draw regular polygons like squares, pentagons, octogons etc:

![Sketch](images/p10.png)

Draw a procedural star like these:

![Sketch](images/p5.png)

### Lecture

- [Read the git manual](https://git-scm.com/docs/user-manual.html)
- The if statement
- While loops
- For loops
- [Video of the class](https://tudublin-my.sharepoint.com/:v:/g/personal/bryan_duggan_tudublin_ie/EVR0aklCcWhDqiFV5czKiRgBviepYTmsqh4ya2zXNV01rw?e=aiexCW)

## Procedural drawing exercises:

### if statement 

- 3 exercises. Click the image for video:

[![YouTube](http://img.youtube.com/vi/18kMOeygmHA/0.jpg)](https://www.youtube.com/watch?v=18kMOeygmHA)

### for loops:

Use a loop, rect and the HSB colour space:

![Sketch](images/p31.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p35.png)

Use a loop, rect and the HSB colour space:

![Sketch](images/p36.png)

Use a loop, ellipse, and the HSB colour space:

![Sketch](images/p34.png)

Use a loop, ellipse and the HSB color space to draw this:

![Sketch](images/p33.png)

Use a nested loop to draw this:

![Sketch](images/p32.png)

Try and draw this using ONE for loop. You will need the [text](https://processing.org/reference/text_.html) and [textAlign](https://processing.org/reference/textAlign_.html) functions:

![Sketch](images/p27.png)

Use a nested loop to draw this: (??)

![Sketch](images/p23.png)

Use sin and cos to draw this: (??)

![Sketch](images/p30.png)

Use line, sin and cos to draw regular polygons like squares, pentagons, octogons etc:

![Sketch](images/p10.png)

Draw a procedural star like these: (??)
![Sketch](images/p5.png)

