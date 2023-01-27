import openai

openai.api_key = "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"
response = openai.Completion.create(
    model="text-davinci-003",
    prompt="BFS及DFS是什麼？請使用繁體中文回答",
    temperature=0.9,
    max_tokens=1000,
    top_p=1,
    frequency_penalty=0.0,
    presence_penalty=0.6,
)
print(response["choices"][0]["text"])

# Result:

# BFS（深度優先搜索）是一種基於橫向探索的搜索算法，它將最優先考慮下一層圖形中的所有點，然後再逐步深入考慮更深層的點。

# DFS（深度優先搜索）是一種基於縱向探索的搜索算法，它將優先考慮圖形中某個點所指向的較深層次的點，並繼續深入探索該點所指向的點，直到不可能進一步深入為止。