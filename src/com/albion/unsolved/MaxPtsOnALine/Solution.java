package com.albion.unsolved.MaxPtsOnALine;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * http://oj.leetcode.com/problems/max-points-on-a-line/
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 * 
 * [X,N] [N,Y]
 * [2,1], [2,2], [3,2], [4,1], [5,5]
 * 
 * 
 * -----
 */
public class Solution {
    public int maxPoints(Point[] points) {
        return 0;
    }
    
//    public Point[] returnVertices(Point[] points)
//    {
//    	SortedSet<Integer> horizontal = new TreeSet<Integer>();
//    	SortedSet<Integer> vertical = new TreeSet<Integer>();
//
//    	for(Point pt : points){
//    		horizontal.add(pt.getX());
//    		vertical.add(pt.getY());
//    	}
//    	
//    	//(1,2), (1,3), (1,4), (1,5)
//    	if(horizontal.size() == 1 )
//    	{
//    		if(vertical.size() == 1){
//    			return 1;
//    		}
//    		else{
//    			return points.length;
//    		}
//    	}
//    	else
//    	
//    	return 0;
//    }
}