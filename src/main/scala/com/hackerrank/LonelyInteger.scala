package com.hackerrank

object LonelyInteger {

  def lonelyinteger(a: Array[Int]): Int = {
    val buff = Array.fill[Int](100)(0)
    println(buff.mkString(";"))
    for (i <- a) {
      buff(i) = buff(i) + 1
    }
    println(buff.mkString(";"))
    for (i <- 0 to buff.length - 1) {
      if (buff(i) == 1) return i
    }
    -1
  }
}

//
//// Complete the boardCutting function below.
//function boardCutting(cost_y, cost_x) {
//  cost_y.sort().reverse();
//  cost_x.sort().reverse();
//
//  let arr = [];
//  let val = cost_x[0];
//  let seen = 1;
//  for(let i = 1; i < cost_x.length; i++) {
//  if(cost_x[i] === val) {
//  seen++;
//} else {
//  arr.push({
//  val,
//  seen,
//  side: 'x'
//});
//  seen = 1;
//  val = cost_x[i];
//}
//}
//
//Jeff Downie12:14
//.reduce((a, b) => a ^ b, 0);
//Jeff Downie12:51
//// Complete the boardCutting function below.
//function boardCutting(cost_y, cost_x) {
//cost_y.sort().reverse();
//cost_x.sort().reverse();
//
//let arr = [];
//let val = cost_x[0];
//let seen = 1;
//for(let i = 1; i < cost_x.length; i++) {
//if(cost_x[i] === val) {
//seen++;
//} else {
//arr.push({
//val,
//seen,
//side: 'x'
//});
//seen = 1;
//val = cost_x[i];
//}
//}
//
//arr.push({
//val,
//seen,
//side: 'x'
//});
//val = cost_y[0];
//seen = 1;
//for(let i = 1; i < cost_y.length; i++) {
//if(cost_y[i] === val) {
//seen++;
//} else {
//arr.push({
//val,
//seen,
//side: 'y'
//});
//seen = 1;
//val = cost_y[i];
//}
//}
//arr.push({
//val,
//seen,
//side: 'y'
//});
//arr.sort((a, b) => {
//return b.va
//arr.sort((a, b) => {
//return b.val === a.val ? b.seen - a.seen : b.val - a.val;
//});
//console.log(arr);
//let total = 0;
//let cuts = {x:1, y:1};
//arr.forEach(a => {
//total = (total + a.val * cuts[a.side] * a.seen) % 1000000007;
//cuts[a.side === 'x' ? 'y' : 'x'] += a.seen;
//})
//return total;