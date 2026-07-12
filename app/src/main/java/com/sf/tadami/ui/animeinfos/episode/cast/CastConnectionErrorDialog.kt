package com.sf.tadami.ui.animeinfos.episode.cast

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.sf.tadami.R
import com.sf.tadami.ui.components.dialog.alert.CustomAlertDialog
import com.sf.tadami.ui.components.dialog.alert.DefaultDialogConfirmButton
import com.sf.tadami.ui.components.widgets.ScrollbarLazyColumn
import com.sf.tadami.ui.utils.padding

@Composable
fun CastConnectionErrorDialog(
    onDismissRequest: () -> Unit,
) {
    val uriHandler = LocalUriHandler.current
    val guideUrl = stringResource(R.string.cast_howto_guide_url)
    CustomAlertDialog(
        onDismissRequest = onDismissRequest,
        title = {
            Text(text = stringResource(R.string.cast_error_dialog_title))
        },
        text = {
            ScrollbarLazyColumn(
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.padding.small),
            ) {
                item { Text(text = stringResource(R.string.cast_error_dialog_message)) }
                item { Text(text = stringResource(R.string.cast_error_dialog_cause_app)) }
                item { Text(text = stringResource(R.string.cast_error_dialog_cause_network)) }
                item { Text(text = stringResource(R.string.cast_error_dialog_cause_reboot)) }

                item { Spacer(Modifier.height(MaterialTheme.padding.small)) }
                item {
                    Text(
                        text = stringResource(R.string.cast_howto_title),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                    )
                }
                item { Text(text = stringResource(R.string.cast_howto_step_downloader)) }
                item { Text(text = stringResource(R.string.cast_howto_step_code)) }
                item {
                    Text(
                        text = stringResource(R.string.cast_howto_downloader_code),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary,
                    )
                }
                item { Text(text = stringResource(R.string.cast_howto_step_install)) }
            }
        },
        // Both actions on a single bottom row: "open guide" on the left, OK on the right.
        confirmButton = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                TextButton(onClick = { uriHandler.openUri(guideUrl) }) {
                    Text(text = stringResource(R.string.cast_howto_open_guide))
                }
                DefaultDialogConfirmButton {
                    onDismissRequest()
                }
            }
        },
    )
}
