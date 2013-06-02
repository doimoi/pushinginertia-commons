/* Copyright (c) 2011-2013 Pushing Inertia
 * All rights reserved.  http://pushinginertia.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pushinginertia.commons.lang;

import com.pushinginertia.commons.core.validation.ValidateAs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Logic that manipulates Java lists.
 */
public class ListUtils {
	/**
	 * Sorts a collection of objects into an indexed list. For example, a {@link java.util.Set} could be passed in and
	 * its members would be sorted into a list.
	 * @param c collection of objects
	 * @param <T> type of the objects in the input collection
	 * @return sorted list
	 */
	public static <T extends Comparable<? super T>> List<T> asSortedList(final Collection<T> c) {
		final List<T> list = new ArrayList<T>(c);
		java.util.Collections.sort(list);
		return list;
	}

	/**
	 * Clones a list with a given element removed. The output list will be the same size as the input list or will contain
	 * one less item.
	 * @param list list to clone
	 * @param itemToRemove item to remove
	 * @param <T> type of the items in the list
	 * @return cloned list with the given item removed (if that item exists in the source list)
	 */
	public static <T> List<T> cloneAndRemove(final List<T> list, final T itemToRemove) {
		ValidateAs.notNull(list, "list");
		ValidateAs.notNull(itemToRemove, "itemToRemove");
		final List<T> clonedList = new ArrayList<T>(list);
		clonedList.remove(itemToRemove);
		return clonedList;
	}
}
