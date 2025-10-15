# Import pandas
import pandas

# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku","JON"],
  "Passwords": ["password", "Charl13", "AllMight","NOPASS"]
}

# Create a DataFrame using that data
df = pandas.DataFrame(data)

# Print the DataFrame
print(df)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
df.to_csv("C:/Users/002S0A744/Desktop/FST/FST_Python/sample.csv", index=False)

df = pandas.read_csv("C:/Users/002S0A744/Desktop/FST/FST_Python/sample.csv")
 
# Print the full data
print("Full Data: ")
print(df)
 
# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(df["Usernames"])
 
# Print the username and password of the second row
print("**************************")
print("Username: ", df["Usernames"][1], " | ", "Password: ", df["Passwords"][1])
 
#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(df.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("------------------------------------")
print("Data sorted in descending Passwords:")
print(df.sort_values('Passwords', ascending=False))