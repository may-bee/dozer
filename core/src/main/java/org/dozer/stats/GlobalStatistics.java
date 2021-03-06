/**
 * Copyright 2005-2017 Dozer Project
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
package org.dozer.stats;

/**
 * Internal singleton class that holds global statistics. Only intended for internal use.
 * 
 * @author tierney.matt
 */
public final class GlobalStatistics {
  private static GlobalStatistics singleton = new GlobalStatistics();

  private final StatisticsManager statsMgr;

  private GlobalStatistics() {
    statsMgr = new StatisticsManagerImpl();
  }

  public static GlobalStatistics getInstance() {
    return singleton;
  }

  public StatisticsManager getStatsMgr() {
    return statsMgr;
  }
}
