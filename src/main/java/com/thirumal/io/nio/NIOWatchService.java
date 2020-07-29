/**
 * 
 */
package com.thirumal.io.nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.*;

import java.io.IOException;

/**
 * @author Thirumal
 *
 */
public class NIOWatchService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WatchService watchService;
		try {
			watchService = FileSystems.getDefault().newWatchService();
			Path directory = Paths.get("/Users/Thirumal/Downloads");
			directory.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
			WatchKey key;
			while ((key = watchService.take()) != null) {
				for (WatchEvent<?> event : key.pollEvents()) {
					if (event.kind() == ENTRY_CREATE) {
						// handle create
						System.out.println("Added File");
					}
					if (event.kind() == ENTRY_DELETE) {
						// handle delete
						System.out.println("deleted File");
					}

					System.out.println(event.kind() + " Event Happened on " + event.context());
				}

				key.reset();
			}

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
