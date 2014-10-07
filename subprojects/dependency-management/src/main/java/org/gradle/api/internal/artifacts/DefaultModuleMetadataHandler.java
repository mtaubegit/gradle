/*
 * Copyright 2014 the original author or authors.
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

package org.gradle.api.internal.artifacts;

public class DefaultModuleMetadataHandler implements ModuleMetadataHandler {
    private final ComponentMetadataProcessor componentMetadataProcessor;
    private final ModuleMetadataProcessor moduleMetadataProcessor;

    public DefaultModuleMetadataHandler(ComponentMetadataProcessor componentMetadataProcessor, ModuleMetadataProcessor moduleMetadataProcessor) {
        this.componentMetadataProcessor = componentMetadataProcessor;
        this.moduleMetadataProcessor = moduleMetadataProcessor;
    }

    public ComponentMetadataProcessor getComponentMetadataProcessor() {
        return componentMetadataProcessor;
    }

    public ModuleMetadataProcessor getModuleMetadataProcessor() {
        return moduleMetadataProcessor;
    }
}