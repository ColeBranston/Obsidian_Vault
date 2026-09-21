Chain-rule works exactly the same as for normal derivatives, but their is a special case...

The formal definition of the chain rule for a function of a single variable. If $y = f(u)$ is a differentiable function of *u*, and $u=u(x)$ is a differentiable function of *x*, then:

$${dy\over dx} = {dy\over du}{du \over dx}$$
- Now we consider the case of a composite function (ultimately just a function of 2 variables as we have been dealing with so far) where $z = f(u,v), u=u(x, y)$, and $v=v(x,y)$, (assuming both *u* and *v* are differentiable with respect to both *x* and *y*)

Then:
$$
\frac{\partial z}{\partial x} = \frac{\partial z}{\partial u} \frac{\partial u}{\partial x} + \frac{\partial z}{\partial v} \frac{\partial v}{\partial x} \text{  and,}
$$
$$
\frac{\partial z}{\partial y} = \frac{\partial z}{\partial u} \frac{\partial u}{\partial y} + \frac{\partial z}{\partial v} \frac{\partial v}{\partial y}
$$
so notice now that the chain rule involves two terms, one for each *u* and *v*.