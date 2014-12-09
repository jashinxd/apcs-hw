<b>Trial 1:</b>

<b>isort:</b>
* Number of assignments: 136
* Number of loops: 98
<br>
<b>ssort:</b>
* Number of assignments: 109
* Number of loops: 209
<br>
<b>bsort:</b>
* Number of assignments: 994
* Number of loops: 280

Trial 2:
isort:
Number of assignments: 108
Number of loops: 70
ssort:
Number of assignments: 101
Number of loops: 209
bsort:
Number of assignments: 938
Number of loops: 280

Trial 3:
isort:
Number of assignments: 129
Number of loops: 91
ssort:
Number of assignments: 107
Number of loops: 209
bsort:
Number of assignments: 1094
Number of loops: 320

Average:
isort:
Number of assignments: 124.3
Number of loops: 86.3
ssort:
Number of assignments: 105.6
Number of loops: 209
bsort:
Number of assignments: 1008.6
Number of loops: 293.3

isort is the most effecient, then ssort, then bsort, in terms of assignments and loops

In terms of time:
   20 items:
      isort: ~0.132s
      ssort: ~0.138s
      bsort: ~0.130

   100,000 items:
      isort: ~2.300s
      ssort: ~13.300s
      bsort: ~41.000s

When I tested with only 20 elements (ints, in my case) in the array, I found that the time between the three sorting methods were apporximately the same. However, after increasing the number of elements, the effect the increasing number of assignments and loops had on the sorts became apparent.
