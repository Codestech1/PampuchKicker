public final class PampuchKicker implements Listener {
  @Subscribe
  public void onPampuchJoin(PlayerLoginEvent event) {
    Player player = event.getPlayer();
    if (isPampuch(player)) {
      player.disconnect("Spierdalaj");
    }
  }

  private boolean isPampuch(Player player) {
    return player.getUsername().equals("Pampuch");
  }
}
