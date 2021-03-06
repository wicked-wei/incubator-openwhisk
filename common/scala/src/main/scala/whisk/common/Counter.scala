/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package whisk.common

import java.util.concurrent.atomic.AtomicLong

/**
 * A simple thread-safe counter.
 */
class Counter {
    private val cnt = new AtomicLong(0L)
    def cur = cnt.get()

    /**
     * Increments and gets the current value.
     */
    def next(): Long = {
        cnt.incrementAndGet()
    }

    /**
     * Decrements and gets the current value.
     */
    def prev(): Long = {
        cnt.decrementAndGet()
    }

    /**
     * Sets the value
     */
    def set(i: Long) = cnt.set(i)
}
