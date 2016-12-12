package main

import "C"

//export Multiply
func Multiply(x, y int64) int64 {
	return x*y
}

func main() {} //dumy
