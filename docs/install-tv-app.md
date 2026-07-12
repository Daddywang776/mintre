# Installing the Tadami Terebi app

To cast from the Tadami phone app to your TV, the **Tadami Terebi app** must be installed on
the TV itself. It is an Android TV / Google TV / Fire TV app and **cannot be pushed from
your phone** — you install it once on the TV using the free **Downloader** app.

**Downloader is only a tool** for fetching app files onto your TV; it is *not* the Tadami
TV app. The code below is what points Downloader at the **Tadami Terebi app** specifically.

You only have to do this once per TV.

---

## 1. Install "Downloader" on your TV

On the TV, open your app store and install the free **Downloader** app **by AFTVnews**
(package `com.esaba.downloader` — make sure it's this one, as several apps are named
"Downloader"):

- **Google TV / Android TV** — Google Play Store
  ([app listing](https://play.google.com/store/apps/details?id=com.esaba.downloader))
- **Fire TV** — Amazon Appstore

The first time you use Downloader to install an app, your TV will ask you to allow
**"install from unknown sources"** for Downloader — accept it (you can turn it back off
afterwards in the TV's security settings).

## 2. Enter the code to download the Tadami Terebi app

Open **Downloader**, go to the **Browse / URL** field, and enter this code to download the
**Tadami Terebi app**:

> ## `4913452`

You can also type the full address instead:

> `go.aftvnews.com/4913452`

This always points to the **latest Tadami Terebi app**, so the same code keeps working for
future updates.

## 3. Install the Tadami Terebi app

Downloader will download the **Tadami Terebi app** file (`.apk`) and then prompt you to install
it. Confirm the install.

## 4. Open it once, then cast

Open the **Tadami Terebi** app on the TV once so the system registers it. Then go back to your
phone and start casting again — your TV should now appear and playback should start.

---

## Alternative: install from a USB drive

If your TV device has a USB port and allows sideloading, you can install the app manually
instead of using Downloader:

1. On a computer or phone, open the **latest release page**:
   [github.com/tadamiorg/tadami-terebi/releases/latest](https://github.com/tadamiorg/tadami-terebi/releases/latest)
2. Download the newest **Tadami Terebi** `.apk` asset from that release.
3. Copy the `.apk` file onto a USB drive.
4. Plug the USB drive into the TV, then use a file-manager app on the TV to open the
   `.apk` and install it (allow "install from unknown sources" if prompted).

> **Note:** not every TV device has a USB port or permits sideloading — this method only
> works if yours does. If in doubt, use the Downloader steps above.

---

## Troubleshooting

If casting still fails after installing the TV app:

- **Same Wi-Fi** — make sure your phone and your TV are connected to the *same* Wi-Fi
  network.
- **Reboot the TV** — restart the TV device, then try casting again.
- **Confirm it installed** — check that the Tadami Terebi app actually appears in your TV's
  list of installed apps.
