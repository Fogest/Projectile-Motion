# Physics Project on Projectile Motion - By Justin Visser

Projectile motion consists of an components. Some of the components that can be applied to pojectile motion are:
* Kinematic's to determine the vertical and horizontal components of the motion of projectile
* Newton's Laws - Projectile should continue in a straight line in the direction it is fired from, but due to some factors this is not true. Mainly a projectile is affected by gravity, thus causing an arc shape (as examples below will show)
* Gravitational and Kinetic energies change as the projectile moves through the air. We can analyze what these energies could be at certain points

Utilizing Java I was able to create a mock projectile simulation (see lower in document for code samples)

## Demo

[Click to download demo file](https://github.com/Fogest/Projectile-Motion/raw/master/javatest/1_45angle/run.jnlp)

## Image Explanation

![Initial Image](https://raw.github.com/Fogest/Projectile-Motion/master/images/Initial%20example-sketch%20and%20fbd.png)

## Calculations Example

![Calculations Example](https://raw.github.com/Fogest/Projectile-Motion/master/images/calculations%20for%20first.png)

## Analyzing the Energies

![energies](https://raw.github.com/Fogest/Projectile-Motion/master/images/energy%20for%20first%20example.png)

## Comparing other angles

[75 Degree Angle Example](https://github.com/Fogest/Projectile-Motion/raw/master/javatest/2_75angle/run.jnlp)

[25 Degree Angle Example](https://github.com/Fogest/Projectile-Motion/raw/master/javatest/3_25angle/run.jnlp)

### Comparing the three

![Comparing the three](https://raw.github.com/Fogest/Projectile-Motion/master/images/comparing.png)

### Conclusion relating to angles

It is clear that achieving the optimal range can be achieved at a 45 degree angle (ref 1). 45 degrees is in between 0 and 90 degrees, allowing for an even amount of of distance covered both in the x and y axis. If one has a lot more than the other, there is going to be less range. Look at the 75 degree angle, there is a large y value compared to the x value, therefore resulting in less range. On the other hand, at 25 degrees there is a large x value and a very small y value, therefore also resulting in a short and quick projection. 45 degrees is therefore the optimal angle.

## Gravity

As seen in all the examples so far, the projectile experienced a parabolic curve, due to being affected by earths gravity at -9.8 m/s. There is no longer a parabolic curve if gravity is eliminated (See example below)

[Projectile Motion with no Gravity](https://github.com/Fogest/Projectile-Motion/raw/master/javatest/4_no_gravity/run.jnlp)

With no gravity a projectile just continues in a straight line in the direction it was shot in. The projectile would continue on forever, unless it hit something else. This is dictated by Newtons first law, the projectile should continue at a constant velocity, unless acted upon by an external force




### References
1. "Maximum Range." Physics Classroom. N.p., n.d. Web. 21 June 2013.