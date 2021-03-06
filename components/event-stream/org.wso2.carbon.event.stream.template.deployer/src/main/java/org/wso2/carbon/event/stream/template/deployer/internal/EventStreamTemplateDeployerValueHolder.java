/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.event.stream.template.deployer.internal;

import org.wso2.carbon.event.stream.core.EventStreamService;
import org.wso2.carbon.registry.core.service.RegistryService;

public class EventStreamTemplateDeployerValueHolder {

    private static EventStreamService eventStreamService;
    private static RegistryService registryService;

    public static void setEventStreamService(EventStreamService eventBuilderService) {
        EventStreamTemplateDeployerValueHolder.eventStreamService = eventBuilderService;
    }

    public static EventStreamService getEventStreamService() {
        return EventStreamTemplateDeployerValueHolder.eventStreamService;
    }

    public static void setRegistryService(RegistryService registryService) {
        EventStreamTemplateDeployerValueHolder.registryService = registryService;
    }

    public static RegistryService getRegistryService() {
        return registryService;
    }
}
