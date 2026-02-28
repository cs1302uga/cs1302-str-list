package cs1302.p2;

import cs1302.adt.Node;
import cs1302.adt.StringList;

/**
 * A {@link cs1302.adt.StringList} implementation that internally uses
 * {@link cs1302.adt.Node} objects to store its items.
 */
public class LinkedStringList extends BaseStringList {

    // ------------------------------------------------------------------------------------------ //
    // INSTANCE VARIABLES
    // ------------------------------------------------------------------------------------------ //

    /**
     * Reference to the first node in the internal linked list.
     */
    Node head;

    // ------------------------------------------------------------------------------------------ //
    // CONSTRUCTOR(S)
    // ------------------------------------------------------------------------------------------ //

    /**
     * Construct a new, empty {@link cs1302.p2.LinkedStringList} object.
     */
    public LinkedStringList() {
        super(); // call BaseStringList() constructor
        this.head = null; // if there are no items, then we do not need any node objects yet
    } // LinkedStringList

    // ------------------------------------------------------------------------------------------ //
    // OVERRIDES AND ADDITIONAL HELPER METHODS
    // ------------------------------------------------------------------------------------------ //

    // ...

} // LinkedStringList
