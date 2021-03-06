/*
 * Copyright 2002-2014 the original author or authors.
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

package opensnap;

public interface Queue {
	final static String SNAP_RECEIVED = "/queue/snap-received";
	final static String SNAP_CREATED = "/queue/snap-created";
	final static String SNAP_BY_ID = "/queue/snap-by-id";
	final static String SNAPS_SENT = "/queue/snaps-sent";
	final static String SNAPS_RECEIVED = "/queue/snaps-received";
	final static String SNAP_DELETED = "/queue/snap-deleted";
	final static String USER_CREATED = "/queue/user-created";
	final static String USER_AUTHENTICATED = "/queue/user-authenticated";
	final static String USER_ALL = "/queue/user-all";
	final static String ERROR = "/queue/error";
}
