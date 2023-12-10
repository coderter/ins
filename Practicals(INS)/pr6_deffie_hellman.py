from random import randint

if __name__ == "__main__":
    p=23
    g=9
    print("The value of P is: %d"%p)
    print("The value of G is: %d"%g)

    a=4
    print("Secret number for Alice is: %d"%a)
    x=int(pow(g,a,p))

    b=6
    print("Secret number for Bob is: %d"%b)
    y=int(pow(g,b,p))

    ka=int(pow(y,a,p))
    kb=int(pow(x,b,p))

    print("Secret number for the Alice is: %d"%ka)
    print("Secret number for the Bob is: %d"%kb)

