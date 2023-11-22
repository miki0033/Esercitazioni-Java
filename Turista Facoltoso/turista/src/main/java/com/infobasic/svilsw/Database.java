package com.infobasic.svilsw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

public class Database {
    static private Map<UUID, User> users = new HashMap<UUID, User>();
    static private Map<UUID, Habitation> habitations = new HashMap<UUID, Habitation>();
    static private Map<UUID, Reservation> reservations = new HashMap<UUID, Reservation>();
}
