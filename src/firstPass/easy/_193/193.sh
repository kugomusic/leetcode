#!/usr/bin/env bash

:<<!
基本的shell使用 Basic shell
grep 正则式；-E 扩展正则模式；\d == [0-9]; {n} 重复n次；注意：区分\(和(，空格不能省略
grep Regular expression；-E Extended regular expression；\d == [0-9]; {n} repeat n times；Note the difference between \( and (, space can not be omitted

执行用时 :8 ms, 在所有 Bash 提交中击败了76.19%的用户
内存消耗 :3.1 MB, 在所有 Bash 提交中击败了78.43%的用户
!

#grep -E '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$' file.txt
grep -E '^([0-9]{3}-|\([0-9]{3}\) )[0-9]{3}-[0-9]{4}$' file.txt