package ru.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    void whenCreateItem() {
        Output output = new MockOutput();
        Input input = new MockInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(output), new ExitAction(output)};
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    @Test
    void whenReplaceItem() {
        Output output = new MockOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        Item item2 = tracker.add(new Item("Item name"));
        Input input = new MockInput(new String[]{"0", "1", "New item name", "1"});
        UserAction[] actions = {new ReplaceAction(output), new ExitAction(output)};
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("New item name");
    }

    @Test
    void whenDeleteItem() {
        Output output = new MockOutput();
        Input input = new MockInput(new String[]{"0", "1", "1"});
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        Item item2 = tracker.add(new Item("Item name"));
        UserAction[] actions = {new DeleteAction(output), new ExitAction(output)};
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll()).hasSize(1);
    }
}