javax.vecmath
=============

A MIT/BSD style licensed free implementation of the javax.vecmath library.

The original (pre-github) implementation is provided by http://objectclub.jp/download/vecmath_e under the license terms stated in the LICENSE file.

Forked from kenjihiranabe/javax.vecmath to add modularity and replace Gradle with Ant+Ivy.
The Color* classes have been removed in order not to depend on `java.desktop`.

Compile the library using

```
ant dist
```
