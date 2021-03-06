<h1>Comparisons between isort, ssort, and bsort</h1>

<h3>Trial 1:</h3>

<b>isort:</b>
* Number of assignments: 136
* Number of loops: 98

<b>ssort:</b>
* Number of assignments: 109
* Number of loops: 209

<b>bsort:</b>
* Number of assignments: 994
* Number of loops: 280

<h3>Trial 2:</h3>

<b>isort:</b>
* Number of assignments: 108
* Number of loops: 70

<b>ssort:</b>
* Number of assignments: 101
* Number of loops: 209

<b>bsort:</b>
* Number of assignments: 938
* Number of loops: 280

<h3>Trial 3:</h3>

<b>isort:</b>
* Number of assignments: 129
* Number of loops: 91

<b>ssort:</b>
* Number of assignments: 107
* Number of loops: 209

<b>bsort:</b>
* Number of assignments: 1094
* Number of loops: 320

<h3>Average:</h3>

<b>isort:</b>
* Number of assignments: 124.3
* Number of loops: 86.3

<b>ssort:</b>
* Number of assignments: 105.6
* Number of loops: 209

<b>bsort:</b>
* Number of assignments: 1008.6
* Number of loops: 293.3

<h3>Analysis:</h3>

isort is the most effecient, then ssort, then bsort, in terms of assignments and loops

<h3>In terms of time:</h3>
&nbsp;&nbsp;&nbsp;&nbsp;20 items:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;isort: ~0.132s<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ssort: ~0.138s<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;bsort: ~0.130s<br>

&nbsp;&nbsp;&nbsp;&nbsp;100,000 items:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;isort: ~2.300s<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ssort: ~13.300s<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;bsort: ~41.000s<br>

When I tested with only 20 elements (ints, in my case) in the array, I found that the time between the three sorting methods were apporximately the same. However, after increasing the number of elements, the effect the increasing number of assignments and loops had on the sorts became apparent.
