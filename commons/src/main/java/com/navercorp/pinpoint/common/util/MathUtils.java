/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.common.util;

/**
 * @author emeroad
 */
public final class MathUtils {
    private MathUtils() {
    }

    /**
     * 返回 value 的绝对值, 若是负数时, 则直接返回正直
     * @param value
     * @return
     */
    public static int fastAbs(final int value) {
        int resultValue =  value & Integer.MAX_VALUE;
        return resultValue;
    }

    public static long roundToNearestMultipleOf(final long num, final long multipleOf) {
        if (num < 0) {
            throw new IllegalArgumentException("num cannot be negative");
        }
        if (multipleOf < 1) {
            throw new IllegalArgumentException("cannot round to nearest multiple of values less than 1");
        }
        if (num < multipleOf) {
            return multipleOf;
        }
        if ((num % multipleOf) >= (multipleOf / 2.0)) {
            return (num + multipleOf) - (num % multipleOf);
        } else {
            return num - (num % multipleOf);
        }
    }
}
