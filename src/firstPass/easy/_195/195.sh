#!/usr/bin/env bash

:<<!
awk: 文本分析 Text analysis
NR表示当前行号, print $0输出当前行
NR indicates the current line number, print $0 outputs the current line

执行用时 :4 ms, 在所有 Bash 提交中击败了93.38%的用户
内存消耗 :3.7 MB, 在所有 Bash 提交中击败了29.37%的用户
!

#awk '{if (NR == 10) {print $0}}' file.txt
awk 'NR == 10 {print $0}' file.txt