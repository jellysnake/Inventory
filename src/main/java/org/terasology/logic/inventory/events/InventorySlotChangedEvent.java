/*
 * Copyright 2013 MovingBlocks
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
package org.terasology.logic.inventory.events;

import org.terasology.engine.entitySystem.entity.EntityRef;
import org.terasology.engine.entitySystem.event.Event;

/**
 */
public class InventorySlotChangedEvent implements Event {
    private int slot;
    private EntityRef oldItem;
    private EntityRef newItem;

    public InventorySlotChangedEvent(int slot, EntityRef oldItem, EntityRef newItem) {
        this.slot = slot;
        this.oldItem = oldItem;
        this.newItem = newItem;
    }

    public int getSlot() {
        return slot;
    }

    public EntityRef getOldItem() {
        return oldItem;
    }

    public EntityRef getNewItem() {
        return newItem;
    }
}
