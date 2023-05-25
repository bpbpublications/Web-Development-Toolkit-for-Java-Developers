import turtle

def draw_branch(branch_length):
    if branch_length < 5:
        return
    else:
        turtle.forward(branch_length)
        turtle.left(30)
        draw_branch(branch_length - 15)
        turtle.right(60)
        draw_branch(branch_length - 15)
        turtle.left(30)
        turtle.backward(branch_length)

turtle.speed(0)
turtle.bgcolor("black")
turtle.color("green")
turtle.left(90)
turtle.up()
turtle.backward(200)
turtle.down()
draw_branch(100)
turtle.exitonclick()
