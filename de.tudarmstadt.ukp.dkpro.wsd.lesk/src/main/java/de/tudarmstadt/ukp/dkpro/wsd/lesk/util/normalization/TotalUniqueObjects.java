/*******************************************************************************
 * Copyright 2016
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package de.tudarmstadt.ukp.dkpro.wsd.lesk.util.normalization;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TotalUniqueObjects
	implements NormalizationStrategy
{

	/**
	 * Takes two arrays of objects and returns the total number of unique
	 * objects in them
	 *
	 * @param o1	the first array of objects
	 * @param o2	the second array of objects
     * @return	the number of unique objects in both arrays
	 */
	@Override
    public double normalizer(List<String> o1, List<String> o2)
	{
		Set<Object> set1 = new HashSet<Object>(o1);

		set1.addAll(o2);
		return set1.size();
	}

}
